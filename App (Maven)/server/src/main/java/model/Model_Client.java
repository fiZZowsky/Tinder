package model;

import com.corundumstudio.socketio.SocketIOClient;
/**
 * MOdel klienta
 * 
 */
public class Model_Client {
/**
 * Pobranie klienta
 * @return 
 */
    public SocketIOClient getClient() {
        return client;
    }
/**
 * Ustawienie klienta
 * @param client pobranie informacje o kliencie
 */
    public void setClient(SocketIOClient client) {
        this.client = client;
    }
/**
 * Pobranie użytkownika
 * @return dane użytkownika 
 */
    public Model_User_Account getUser() {
        return user;
    }
/**
 * Ustawienie użytkownika
 * @param user 
 */
    public void setUser(Model_User_Account user) {
        this.user = user;
    }
/**
 * Ustawienie klienta i użytkownika
 * @param client pobranie klienta
 * @param user pobranie użytkownika
 */
    public Model_Client(SocketIOClient client, Model_User_Account user) {
        this.client = client;
        this.user = user;
    }

    public Model_Client() {
    }

    private SocketIOClient client;
    private Model_User_Account user;
}
