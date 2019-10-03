public class MainException {

    public static void main(String[] args) {

        System.out.println("programa iniciando");

        try {
            int resultado = 100 / 0;
            System.out.println("resultado: " + resultado);
        } catch (Exception exception){
            System.out.println("operação inválida");
            System.out.println("mensagem: " + exception.getMessage());
        } finally {
            System.out.println("isso sempre vai acontecer");
        }

        System.out.println("programa finalizado");






    }

}
