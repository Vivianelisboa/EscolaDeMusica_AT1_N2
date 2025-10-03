/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.escola;

public class Saxofone extends InstrumentoMusical {
    private String tipo;

    public Saxofone(String nome, String material, String tipo) {
        super(nome, material);
        this.tipo = tipo;
    }

    @Override
    public void tocar() {
        System.out.print("Tocando jazz suave com " + super.getNome() + ", " + tipo);
        System.out.println(" - melodia envolvente.");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando embocadura e as chaves.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo: " + tipo);
    }
}
