public class Cat{
    public boolean estado;
    public String nome;
    public String familia;
    public String classe;
    public int idade;
    private int strength;
    private int caloria;
    
    public Cat(String nome, String familia, String classe) {
         this.estado = true; // vivo 
         this.strength = 10;
         this.caloria = 10;
         this.idade = 0;
         this.nome = nome;
         this.familia = familia;
         this.classe = classe;
         
    }

         public void setstrength(int strength) {
             this.strength = strength;
         }

         public int getstrength() {
             return strength;
        }

        public void setcaloria(int caloria) {
            this.caloria = caloria;
        }

        public int getcaloria() {
            return caloria;
        }

       public void imprimirGato() {
            System.out.println("O nome do gato é " + this.nome + " da familia " + this.familia + " da classe " + this.classe + 
            " Tem força: " + this.strength + " e caloria de " + this.caloria);
       }

       public void morrer(){
           this.estado = false; // morto
           this.strength = 0; // colocando 0 na força 
           System.out.println("O gato " + this.nome + " morreu :(");
       }

       public void comer() {
            if(estado == true && getcaloria() <= 90) {
                  caloria = getcaloria() + 10;
                  strength = getstrength() - 2;
                  System.out.println("O animal comeu e sua força agora é de" + getstrength() + " e caloria de "
                  + getcaloria());
            }   else if(getcaloria() > 100) 
            {
                System.out.println("O gatinho tá de bucho cheio");
            }   else {
                System.out.println("O gatinho está morto, impossível alimentar.");
            }
       }
        
       public void correr() {
            if(estado == true && getcaloria() >=5 && getstrength() >= 5) {
                setcaloria(getcaloria() - 5);
                setstrength(getstrength() -5);
                 System.out.println("O gatinho está correndo. Agora sua força é de " + getstrength() + " sua caloria atual é "
                 + getcaloria());
            }   else if(estado == true && getcaloria() < 5 && getstrength() < 5) {
                 System.out.println("o gato " + this.nome + " está exausto alimente-o ou coloque-o para dormir");
            }   else {
                 System.out.println("Impossível correr.");
            }
       }

       public void dormir() {
            if(estado == true) {
                setcaloria(getcaloria() -2);
                setstrength(getstrength() + 10);
                 System.out.println("O gato " + this.nome + " está dormindo! Não o incomode." +
                  "Enquanto isso força aumentou para " + getstrength() + " e suas calorias diminuaram para " + getcaloria());
            }
       }

       public void miar() {
            if(estado == true && strength >=2 && caloria >=1 ) {
                setstrength(getstrength() -2);
                setcaloria(getcaloria() -1);
                System.out.println("MIAU");

            } else if(estado == true && getstrength() < 2) {
                System.out.println("O gato " + this.nome + " está sem forças para miar, coloque ele para dormir");
            } else if(estado == true && getcaloria() < 1) {
                System.out.println(" O gato está passando fome! Não se preocupe, você vai morrer por motivos desconhecidos");
            } else {
                System.out.println("Você é psicopata?");
            }
       }
        
    
    
    
    
}


