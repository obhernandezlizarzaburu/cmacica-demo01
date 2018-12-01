package pe.cmacica.labs.labs01.Services;

import pe.cmacica.labs.labs01.Repository.ClienteRepository;

public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService()
    {
        this.clienteRepository=new ClienteRepository();
    }

    public void guardar()
    {
        this.clienteRepository.guardar();
    }
}
