package one.digitalinnovation.gof.Facade;

import one.digitalinnovation.gof.Subsistema1CRM.CrmService;
import one.digitalinnovation.gof.Subsistema2CEP.CepApi;

public class Facade {
    public static void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente (nome, cep, cidade, estado);
    }
}
