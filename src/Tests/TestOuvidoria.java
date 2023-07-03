package Tests;
import application.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestOuvidoria {

    @Test
    public void testAdicionarManifestacao() {
        Ouvidoria ouvidoria = new Ouvidoria(5);
        Pessoa pessoa = new Pessoa("Teste");
        Manifestacao manifestacao = new Reclamacao(pessoa, "Testando");
        
        ouvidoria.adicionarManifestacao(manifestacao);
        
        assertEquals(ouvidoria.listarManifestacoesPorTipo(1), 1); // Assume que o método listarManifestacoesPorTipo agora retorna uma lista
    }

    @Test
    public void testIsCheia() {
        Ouvidoria ouvidoria = new Ouvidoria(5);
        Pessoa pessoa = new Pessoa("Teste");
        Manifestacao manifestacao = new Reclamacao(pessoa, "Testando");

        for(int i = 0; i < 5; i++) {
            ouvidoria.adicionarManifestacao(manifestacao);
        }

        assertTrue(ouvidoria.isCheia());
    }

    @Test
    public void testListarManifestacoesPorTipo() {
        Ouvidoria ouvidoria = new Ouvidoria(5);
        Pessoa pessoa = new Pessoa("Teste");
        Manifestacao manifestacao1 = new Reclamacao(pessoa, "Testando Reclamação");
        Manifestacao manifestacao2 = new Elogio(pessoa, "Testando Elogio");
        
        ouvidoria.adicionarManifestacao(manifestacao1);
        ouvidoria.adicionarManifestacao(manifestacao2);

        assertEquals(ouvidoria.listarManifestacoesPorTipo(1), 1);
        assertEquals(ouvidoria.listarManifestacoesPorTipo(2), 1);
    }

 
}

