package br.com.fiap.tds.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Teste.java ->  compilar >> Teste.class (bytecode) >> Interpreta na JVM >> "Execução"

//Target -> define o lugar onde a anotação pode ser utilizada
//FIELD -> atributos
//{ } -> Entre chaves quando for mais de um tipo
@Target({ElementType.FIELD, ElementType.METHOD})

//Retention ->  define até quando a anaotação estará presente
//SOURCE -> até o .java
//CLASS -> até o .class
//RUNTIME -> até o final(JVM)
@Retention(RetentionPolicy.RUNTIME)

public @interface Coluna {

    String nome();
    int tamanho() default 255;
    boolean pk() default false;

}


