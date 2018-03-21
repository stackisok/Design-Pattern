package builder;

/***
 *
 *@Author ChenjunWang
 *@Description:产品类，服务器有操作系统，所用语言，所选服务器和所选数据库
 *@Date: Created in 21:05 2018/3/20
 *@Modified By:
 *
 */
public class ServerProduct {
    private String os;
    private String language;
    private String server;
    private String database;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getEnvironment() {
        return "ServerProduct{" +
                "os='" + os + '\'' +
                ", language='" + language + '\'' +
                ", server='" + server + '\'' +
                ", database='" + database + '\'' +
                '}';
    }
}
