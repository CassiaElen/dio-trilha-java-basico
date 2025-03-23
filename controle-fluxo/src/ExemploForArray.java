public class ExemploForArray {
    

    public static void main(String[] args) {
        
        String alunos [] = {"GLEDSON", "CLOTILTES", "MARICLEIA", "CALISTO"};
        
        for (int x = 0; x<alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x] );
        }

        //foreach
        for (String aluno : alunos) {

            System.out.println("O nome do aluno é " + aluno);
            
        }
    }
}
