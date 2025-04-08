
package aula01ex01;

/**
 *
 * @author unifgbomfim
 */
// uma proteção # no uml é protegido, - é publico
public class Pessoa {
    private String nome;  
    private String sobrenome;
    private int idade; 
    
    public Pessoa (String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
   
}
