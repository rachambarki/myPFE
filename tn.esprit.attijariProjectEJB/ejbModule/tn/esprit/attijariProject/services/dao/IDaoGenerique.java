package tn.esprit.attijariProject.services.dao;

public interface IDaoGenerique<T> {

	public abstract void creer(T t);

	public abstract void modifier(T t);

	public abstract void supprimer(T t);

}