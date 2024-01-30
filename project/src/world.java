void main(){
    System.out.println("hello how ar you");


}
public class ServiceFactory{
    private static  ServiceFactory serviceFactory;
    private ServiceFactory(){}

    private static ServiceFactory getInstance(){
        if (serviceFactory==null){
            serviceFactory=new ServiceFactory();
        }
    }
    public SuperService getService(ServiceType serviceType){
        switch (serviceType){

        }

    }

}