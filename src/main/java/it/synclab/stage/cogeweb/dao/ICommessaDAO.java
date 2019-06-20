package it.synclab.stage.cogeweb.dao;

import java.util.List;

import it.synclab.stage.cogeweb.entities.Commessa;

public interface ICommessaDAO {
	public void addCommessa(Commessa commessa);
	public void deleteCommessa(Commessa commessa);
	public List<Commessa> findListaCommesse();
	public void updateCommessa(Commessa commessaField,Commessa commessanew);
}
