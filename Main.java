import javax.print.attribute.standard.DateTimeAtCompleted;

class Main {
  public static void main(String[] args) {
    
    Cozinha mineira = criaCozinhaMineira();
    Cozinha chinesa = criaCozinhaChinesa();
    Cozinha italiana = criaCozinhaItaliana();
  }

  private static Cozinha criaCozinhaMineira(){
    Cozinha mineira = new Cozinha();
    mineira.horaAbertura = 14;
    mineira.horaFechamento = 20;
    mineira.pratoPrincipal = "Feijoada";
    mineira.ingredientes = new Array[5];
    mineira.funcionarios = new Array[4];

    Ingrediente farinha = new Ingrediente("Farinha", LocalDateTime.of(2022,10,05));

    Ingrediente feijao = new Ingrediente("Feijao", LocalDateTime.of(2022,10,05));

    Ingrediente carnePorco = new Ingrediente("Carne Porco", LocalDateTime.of(2022,10,05));

    Ingrediente arroz = new Ingrediente("Arroz", LocalDateTime.of(2022,10,05));

    Ingrediente linguica = new Ingrediente("Linguiça", LocalDateTime.of(2022,10,05));

    mineira.ingredientes[0]= farinha;
    mineira.ingredientes[1]= feijao;
    mineira.ingredientes[2]= arroz;
    mineira.ingredientes[3]= carnePorco;
    mineira.ingredientes[4]= linguica;

    Funcionario luisa = new Funcionario("Luísa", "Chefe de cozinha"); 

    Funcionario fernanda = new Funcionario("Fernanda", "Subchefe"); 

    Funcionario ricardo = new Funcionario("Ricardo", "Gerente"); 

    Funcionario gabi = new Funcionario("Gabi", "Faxina"); 

    mineira.funcionarios[0]= luisa;
    mineira.funcionarios[1]= fernanda;        mineira.funcionarios[2]= ricardo;
    mineira.funcionarios[3]= gabi;
    return mineira;
  }

  private static Cozinha criaCozinhaChinesa(){
    Cozinha chinesa = new Cozinha();
    chinesa.horaAbertura = 10;
    chinesa.horaFechamento = 21;
    chinesa.pratoPrincipal = "Yakissoba";
    chinesa.ingredientes = new Array[4];
    chinesa.funcionarios = new Array[3];

    Ingrediente macarrao = new Ingrediente("Macarrão", LocalDateTime.of(2022,8,22));

    Ingrediente carne = new Ingrediente("Carne", LocalDateTime.of(2021,11,17));

    Ingrediente molho = new Ingrediente("Molho", LocalDateTime.of(2021,6,05));

    chinesa.ingredientes[0]= macarrao;
    chinesa.ingredientes[1]= carne;
    chinesa.ingredientes[2]= molho;

    Funcionario aline = new Funcionario("Aline", "Chefe de cozinha"); 

    Funcionario natalia = new Funcionario("Natália", "Subchefe"); 

    Funcionario ana = new Funcionario("ana", "Auxiliar geral"); 

  
    chinesa.funcionarios[0]= aline;
    chinesa.funcionarios[1]= natalia;        
    chinesa.funcionarios[2]= ana;
    return chinesa;
  }
  
  private static Cozinha criaCozinhaItaliana(){
    Cozinha italiana = new Cozinha();
    italiana.horaAbertura = 13;
    italiana.horaFechamento = 22;
    italiana.pratoPrincipal = "Espaguete";
    italiana.ingredientes = new Array[3];
    italiana.funcionarios = new Array[2];

    Ingrediente macarrao = new Ingrediente("Macarrão", LocalDateTime.of(2023,7,15));

    Ingrediente carne = new Ingrediente("Carne", LocalDateTime.of(2021,12,9));

    Ingrediente molho = new Ingrediente("Molho", LocalDateTime.of(2021,6,05));

    italiana.ingredientes[0]= macarrao;
    italiana.ingredientes[1]= carne;
    italiana.ingredientes[2]= molho;

    Funcionario francisco = new Funcionario("Francisco", "Chefe de cozinha"); 

    Funcionario sofia = new Funcionario("Sofia", "Garçonete");
  
    italiana.funcionarios[0]= francisco;
    italiana.funcionarios[1]= sofia;        
    return italiana;
  }
}
