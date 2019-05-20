/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoprova;

/**
 *
 * @author emilly
 */
public class pessoa {
    private String nome;
    private data dataDeNascimento;

public void getmostrar(){
    System.out.println (nome);
    System.out.println (dataDeNascimento);
}

public String getNome(){
    return this.nome;
}

public data getDatadeNascimento(){
    return this.dataDeNascimento;
}

public void setNome(String n){
    this.nome = n;
}

public void setDatadeNascimento(data da){
    this.dataDeNascimento = da;
}

}

    

