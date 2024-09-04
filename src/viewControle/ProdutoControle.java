/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;

import bean.ProdutoMsl;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sebas
 */
public class ProdutoControle extends AbstractTableModel {
    List lista;
    
    
    public void setList(List lista){
        this.lista = lista;
        //System.out.println("setlist");
        //atualizar
        this.fireTableDataChanged();
    }
    public ProdutoMsl getBean(int linha){
        //System.out.println("getbean");
        return (ProdutoMsl) lista.get(linha);
    }
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("rowcount");
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("columncount");
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. return
        ProdutoMsl produto = (ProdutoMsl) lista.get(rowIndex);
        //System.out.println("getvalueat" + rowIndex + "e" + columnIndex);

        if (columnIndex == 0) {
            return produto.getIdprodutoMsl();
        }
        if (columnIndex == 1) {
            return produto.getNomeMsl();
        }
        if (columnIndex == 2) {
            return produto.getPrecoMsl();
        }
        if (columnIndex == 3) {
            return produto.getCategoriaMsl();
        }

        return "conteudo";
    }

    @Override
    public String getColumnName(int column) {
        //colocar o nome nos campos
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Preço";
        }
        if (column == 3) {
            return "Categoria";
        }
        return "";
    }
}
