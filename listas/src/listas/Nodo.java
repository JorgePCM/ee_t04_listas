package listas;

public class Nodo <T>
{
private T dato;
private Nodo<T> siguiente;
    
public Nodo(T o)        
{
    setDato(o);
    siguiente=null;
}

    
public void setDato(T o)
{
  dato=o;
}
public T getDato(){
  return dato;
}
public void setSiguiente(Nodo<T> n){
   siguiente=n;
}
public Nodo<T> getSiguiente(){
  return siguiente;
}

@Override
public String toString(){
return ""+dato +"";
	
}
}

