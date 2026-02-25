public class Main {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv(5, 22, true);

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