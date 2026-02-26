public class Main {
    public static void main(String[] args) {
        //Instância da classe através da sua interface
        ISmartTv tvReal = new SmartTv(5, 22, false);

        ISmartTv tv = (ISmartTv) java.lang.reflect.Proxy.newProxyInstance(
                ISmartTv.class.getClassLoader(), // Carrega a classe
                new Class<?>[]{ ISmartTv.class }, // Passa a nova instância
                new SmartTvHandler(tvReal) //Manda a instância real pro handler
        );

        System.out.println("--- Testando com a TV Desligada ---");
        try {
            // Isso vai falhar e cair no catch, pois a TV começa desligada (on = false)
            tv.setChannel(5);
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado capturado:    " + e.getMessage());
        }

        System.out.println("\n--- Ligando a TV ---");
        tv.setOn_Off(true); // Agora a TV está ligada

        System.out.println("\n--- Mudando de Canal ---");
        System.out.println(tv.setChannel(12));
        System.out.println("Canal atual verificado: " + tv.getChannel());

        System.out.println("\n--- Testando Volume ---");
        // O volume inicial é 5
        System.out.println(tv.riseVolume()); // Vai para 6
        System.out.println(tv.riseVolume()); // Vai para 7
        System.out.println(tv.decreaseVolume()); // Volta para 6
    }
}