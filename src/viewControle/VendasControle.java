/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewControle;

import bean.VendasMsl;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sebas
 */
public class VendasControle extends AbstractTableModel {
    List lista;
    
    public void setList(List lista){
        this.lista = lista;
    }
    public VendasMsl getBean(int linha){
        return (VendasMsl) lista.get(linha);
    }
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. return
        VendasMsl vendas = (VendasMsl) lista.get(rowIndex);

        if (columnIndex == 0) {
            return vendas.getIdvendaMsl();
        }
        if (columnIndex == 1) {
            return vendas.getDataVendasMsl();
        }
        if (columnIndex == 2) {
            
            return vendas.getClienteMsl();
        }
        if (columnIndex == 3) {
            return vendas.getFuncionarioMsl();
        }
        if (columnIndex == 4) {
            return vendas.getValorTotalMsl();
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
            return "Data";
        }
        if (column == 2) {
            return "Cliente";
        }
        if (column == 3) {
            return "Funcionario";
        }
        if (column == 4) {
            return "Valor Total";
        }
        return "";
    }
}
