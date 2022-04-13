
public class Teste {

    public static void main(String[] args) {

        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);

    }
}

//saida = 0 1 2 3

//se i = 0 
//print i++ ->(0)
//print i -> (1)

//se i = 0 
//print ++i -> (1)
//print i -> (1)

//se i = 0
//print i = i + 1 -> (1)
//print i -> (1)
