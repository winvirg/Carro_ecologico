public class Carro {

    private int passageiros = 0;
    public int combustivel = 0;
    private int km = 0;

    public int getPassageiros() {
        return passageiros;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public int getQuilometragem() {
        return km;
    }

    public boolean embarcar() {
    	if(passageiros >= 2) {
    		return false;   	}
    	else{
            passageiros += 1; 
            return true;
        }
    }

    public boolean desembarcar() {
    	if(passageiros <= 0) {
    		return false;
    	}
    	else {
            passageiros -= 1; 
            return true;
        }
    }

    public boolean dirigir(int distancia) {
        if(combustivel == 0){
            return false;
        }else{
            if (distancia > combustivel){
                km += combustivel;
                combustivel = 0;
                return false;
            }else{
                combustivel -= distancia;
                km += distancia;
                return true;
            } 
        }
        
    }

    public boolean abastecer(int quantidade) {
        if (combustivel + quantidade > 100) {
        	combustivel = 100;
        	return true;
        }
        if (quantidade < 0) {
        	return false;
        }
        else {
        	combustivel += quantidade;
        	return true;
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "passageiros=" + getPassageiros() +
                ", combustivel=" + getCombustivel() +
                ", quilometragem=" + getQuilometragem() +
                '}' + 
                "\n";
    }


}