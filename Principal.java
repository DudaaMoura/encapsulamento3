public class Principal {

    public static void main(String[] args) {

        Perfil perfil = new Perfil("Maria Eduarda Moura Gandra", 17, "Dudamouraa", "1234566");

        System.out.println("O seu nome é: "+perfil.getNome());
        System.out.println("A sua idade é: "+perfil.getIdade());
        System.out.println("O seu username é: "+perfil.getUsername());
        perfil.setSenha("Etec123");

        if(perfil.verificaSenha("Etec2021")){
            System.out.println("senha válida!");
        }
        else{
            System.out.println("senha inválida!");
        }
        
        



    }
    
}
