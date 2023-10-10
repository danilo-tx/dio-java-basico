public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo Status TV Ligada ? " + smartTv.ligada);
        while(smartTv.volume < 50){
            smartTv.aumentarVolume();

            System.out.println("Volume = " + smartTv.volume);
        }

        while(smartTv.volume > 0){
            smartTv.diminuirVolume();

            System.out.println("Volume = " + smartTv.volume);
        }
        smartTv.mudarCanal(13);

        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.desligar();

        System.out.println("A TV esta ligada ? " + smartTv.ligada);
    }

}
