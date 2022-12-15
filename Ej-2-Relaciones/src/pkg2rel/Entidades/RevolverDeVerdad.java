
package pkg2rel.Entidades;

public class RevolverDeVerdad {
    private Integer posactual;
    private Integer posbala;

    public RevolverDeVerdad() {
    }

    public RevolverDeVerdad(Integer posactual, Integer posbala) {
        this.posactual = posactual;
        this.posbala = posbala;
    }
    

    public Integer getPosactual() {
        return posactual;
    }

    public Integer getPosbala() {
        return posbala;
    }

    public void setPosactual(Integer posactual) {
        this.posactual = posactual;
    }

    public void setPosbala(Integer posbala) {
        this.posbala = posbala;
    }
    
    
    public void llenarRevolver(){
        this.posactual = (int) (Math.random() * 6 + 1);
        this.posbala = (int) (Math.random() * 6 + 1);
    }
    
    
    public boolean disparar(){
        boolean flag = false;
        if (posactual == posbala) {
            flag = true;
        }
        return flag;
    }
    
    public void siguienteBala(){
        if (posactual == 6) {
            posactual = 1;
        } else {
            posactual++;
        }
    }

    @Override
    public String toString() {
        return "Juego{" + "Posición Actual = " + posactual + ", Posición Bala = " + posbala + '}';
    }

}
