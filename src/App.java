public class App {
    public static void main(String[] args) throws Exception {
        Subject calculation = new Subject();

        calculation.name = "Calculation";
        calculation.introduction = "Em cálculo você aprenderá sobre Limites, Derivadas e Integrais";

        calculation.topics[0].name = "Limite";
        calculation.topics[1].name = "Derivadas";
        calculation.topics[2].name = "Integrais";
        
        calculation.publisher.name = "Lucas";
        calculation.publisher.description = "Formado em Matemática na Universidade de São Paulo";
        
        calculation.publisher.setEmail("lucas@usp.br");

        calculation.increaseViews();
    }
}
