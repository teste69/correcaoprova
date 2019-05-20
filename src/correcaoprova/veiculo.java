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
public class veiculo {
    private data DataCompra;
    private pessoa proprietario;
    private String finalidade;
    
public void getmostrar(){
    System.out.println (DataCompra);
    System.out.println (proprietario);
    System.out.println (finalidade);
}
public boolean getinformarfinalidade(String finalidade){
    if (finalidade.equals ("passeio")){
        return true;
    }
    if (finalidade.equals ("taxi")){
        return true;
    }
    if (finalidade.equals ("carga")){
        return true;
    }
    else{
        return false;
    }
}
 public data getDataCompra(){
     return this.DataCompra;
 }
 public proprietario getproprietario(){
     return this.proprietario;
 }
 public String finalidade(){
     return this.finalidade;
 }
 public void setDatadaCompra(data d){
     this.DataCompra = d;
 }
 public void setproprietario(proprietario p){
     this.proprietario = p;
 }
 public void setfinalidade (String f){
     this.finalidade = f;
 }}
    
