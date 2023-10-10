public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=10;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        if(volume < 50){
            volume++;
        }
    }

    public void diminuirVolume(){
        if(volume > 0){
            volume--;
        }
    }

    public void mudarCanalAcima(){
        if(canal < 50){
            canal++;
        }else{
            canal=1;
        }
    }

    public void mudarCanalAbaixo(){
        if(canal > 1){
            canal--;
        }else{
            canal=50;
        }
    }

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }

}