import java.util.ArrayList;
import java.util.List;

public class ExercicioException {

    public static void main(String[] args) {

        /*List<String> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add("Pato");
        listaDeAnimais.add("Cachorro");
        listaDeAnimais.add("Gato");

        try {
            System.out.println(listaDeAnimais.get(3));
        } catch (Exception exception){
            System.out.println("posição inexistente");
            System.out.println("ERRO: " + exception.getMessage());
        }*/

        try { List<String> listaDeAnimais = new ArrayList<>();
            listaDeAnimais.add("Pato");
            listaDeAnimais.add("Cachorro");
            listaDeAnimais.add("Gato");

        System.out.println(listaDeAnimais.get(2));

        } catch (NullPointerException nullPointerException){
            //exception.printStackTrace(); //tipo de erro
            //System.out.println("ERRO: " + exception.getMessage());//mensagem de erro
            System.out.println("Objeto está nulo");
        } catch (IndexOutOfBoundsException indexException){
            System.out.println("o indice buscado está incorreto");
        } catch (Exception exception){
            System.out.println("erro desconhecido");
        }

        System.out.println("erro desconhecido");

    }
}