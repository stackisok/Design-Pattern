package builder;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 21:12 2018/3/20
 *@Modified By:
 *
 */
public interface Builder {
    Builder installOS(String OS);
    Builder installLanguage(String language);
    Builder installServer(String server);
    Builder installDatabase(String database);
    ServerProduct getProduct();
}