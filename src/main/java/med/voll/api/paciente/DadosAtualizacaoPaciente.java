package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

public record DadosAtualizacaoPaciente(

        @NotNull
        Long id,
        String telefone,
        String nome ,
        DadosEndereco endereco){
}
