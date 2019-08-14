package br.biblioteca.livros.service;

import java.util.List;

import br.biblioteca.livros.entidades.Login;

public interface UserService
{
	
	void save (Login user);

	Login findByUsername (String username);

	List<Login> findAll ();
	
}