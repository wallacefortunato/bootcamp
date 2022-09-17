public class CaixaEletronico {

    public static void main(String[] args){

// TODO: Crie um Array de números inteiros:
        int[] a= {1,5,8,12,17,49,81,102};

// TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:
        for (int i=0; i < a.length; i++){
            if ((a[i] % 2) == 0){
                System.out.println(a[i]);
            }
        }

    }
}
