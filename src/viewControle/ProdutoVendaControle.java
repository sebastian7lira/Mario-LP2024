/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;

import bean.ProdutoVendaMsl;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sebas
 */
public class ProdutoVendaControle extends AbstractTableModel {
    List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    public ProdutoVendaMsl getBean(int linha){
        return (ProdutoVendaMsl) lista.get(linha);
    }
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. return
        ProdutoVendaMsl produtoVenda = (ProdutoVendaMsl) lista.get(rowIndex);

        
        if (columnIndex == 0) {
            return produtoVenda.getProdutoMsl();
        }
        if (columnIndex == 1) {
            return produtoVenda.getValorUnitarioMsl();
        }
        if (columnIndex == 2) {
            return produtoVenda.getQuantidadeMsl();
        }
        if (columnIndex == 3) {
            double total = produtoVenda.getQuantidadeMsl() * produtoVenda.getValorUnitarioMsl();
            return total;
        }

        return "conteudo";
    }
    public void addBean(ProdutoVendaMsl vendasprod){
        lista.add(vendasprod);
        this.fireTableDataChanged();
    }
    public void updateBean(int index,ProdutoVendaMsl vendasprod){
        lista.set(index, vendasprod);
        this.fireTableDataChanged();
    }
    public void removeBean(int index){
        lista.remove(index);
        this.fireTableDataChanged();
    }
     public void limparTabela() {
        lista.clear();
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        //colocar o nome nos campos
        if (column == 0) {
            return "Produto";
        }
        if (column == 1) {
            return "Valor Unitário";
        }
        if (column == 2) {
            return "Quantidade";
        }
        if (column == 3) {
            return "Total";
        }
        return "";
    }
}
