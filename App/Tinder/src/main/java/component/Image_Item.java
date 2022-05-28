package component;

import event.EventFileReceiver;
import event.EventFileSender;
import model.Model_File_Sender;
import model.Model_Receive_Image;
import service.Service;
import swing.blurHash.BlurHash;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Image_Item extends javax.swing.JLayeredPane {

    public Image_Item() {
        initComponents();
    }

    public void setImage(Icon image, Model_File_Sender fileSender) {
        fileSender.addEvent(new EventFileSender() {
            @Override
            public void onSending(double percentage) {
                progress.setValue((int) percentage);
            }

            @Override
            public void onStartSending() {
            }

            @Override
            public void onFinish() {
                progress.setVisible(false);
            }
        });
        pic.setImage(image);
    }

    public void setImage(Model_Receive_Image dataImage) {
        int width = dataImage.getWidth();
        int height = dataImage.getHeight();
        int[] data = BlurHash.decode(dataImage.getImage(), width, height, 1);
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        img.setRGB(0, 0, width, height, data, 0, width);
        Icon icon = new ImageIcon(img);
        pic.setImage(icon);
        try {
            Service.getInstance().addFileReceiver(dataImage.getFileID(), new EventFileReceiver() {
                @Override
                public void onReceiving(double percentage) {
                    progress.setValue((int) percentage);
                }

                @Override
                public void onStartReceiving() {

                }

                @Override
                public void onFinish(File file) {
                    progress.setVisible(false);
                    pic.setImage(new ImageIcon(file.getAbsolutePath()));
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new swing.PictureBox();
        progress = new swing.Progress();

        setMinimumSize(new java.awt.Dimension(121, 131));
        setPreferredSize(new java.awt.Dimension(121, 131));

        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setProgressType(swing.Progress.ProgressType.CANCEL);
        pic.add(progress);
        progress.setBounds(30, 40, 50, 50);

        setLayer(pic, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.PictureBox pic;
    private swing.Progress progress;
    // End of variables declaration//GEN-END:variables
}