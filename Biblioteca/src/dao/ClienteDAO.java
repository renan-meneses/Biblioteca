package dao;

import java.util.List;

import entily.Cliente;


public interface ClienteDAO {

	public void save(Cliente cliente);
	
	public void update(Cliente cliente);
	
	public void delete(int id);

	public Cliente find(int id);

	public List<Cliente> find();


}
