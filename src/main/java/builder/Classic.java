package builder;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 22:04 2018/3/20
 *@Modified By:
 *
 */
public class Classic implements Builder{

    private ServerProduct serverProduct = new ServerProduct();
    @Override
    public Builder installOS(String OS) {
        serverProduct.setOs(OS);
        return this;
    }

    
    @Override
    public Builder installLanguage(String language) {
        serverProduct.setLanguage(language);
        return this;
    }

    @Override
    public Builder installServer(String server) {
        serverProduct.setServer(server);
        return this;
    }

    @Override
    public Builder installDatabase(String database) {
        serverProduct.setDatabase(database);
        return this;
    }

    @Override
    public ServerProduct getProduct() {
        return serverProduct;
    }
}
