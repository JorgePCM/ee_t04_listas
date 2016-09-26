package listas;

public class Lista<T> {
private Nodo<T> inicio;

public Lista(){
inicio=null;	
}

public void setInicio(Nodo<T> inicio){
this.inicio=inicio;	
}

public Nodo<T> getInicio(){
return inicio;	
}

public void insertaInicio(T dato){
Nodo<T> aux=new Nodo<T>(dato);	
aux.setSiguiente(inicio);
inicio=aux;
}

public void insertarFin(T dato){
Nodo<T> aux=inicio;
while(aux.getSiguiente()!=null){
aux=aux.getSiguiente();	
}
Nodo<T>aux2=new Nodo<T>(dato);
aux.setSiguiente(aux2);
aux2.setSiguiente(null);
}

public void insertarAntes(T Dato, T Busqueda){
Nodo<T>aux =inicio;
Nodo<T>aux2=null;
int bandera=1;

while(aux.getDato()!=Busqueda && bandera ==1 ){
if(aux.getSiguiente() != null){
aux2=aux;
aux=aux.getSiguiente();
}else{
bandera=0;	
}	
}
if (bandera==1){
Nodo<T>n= new Nodo<T>(Dato);	
if(inicio == aux){
n.setSiguiente(inicio);
inicio=n;
}else if(bandera==0){
System.out.println("El nodo dado como referencia no se encuentra");
}else{
aux2.setSiguiente(n);
n.setSiguiente(aux);	
}	
}
}

public void insertarDespues(T Dato,T Busqueda){
Nodo<T> aux=inicio;
int Bandera =1;

while(aux.getDato()!= Busqueda && Bandera==1){
if(aux.getSiguiente()!=null){
aux=aux.getSiguiente();	
}else{
Bandera=0;	
}	
}
if(Bandera==1){
Nodo<T> dato=new Nodo<T>(Dato);
dato.setSiguiente(aux.getSiguiente());
aux.setSiguiente(dato);
}else{
System.out.println("EL noo dado como referencia no se encuentra");		
}
}




public void recorrer(){
Nodo<T>aux =inicio;
while(aux!=null){
System.out.println(aux+"-->");
aux=aux.getSiguiente();
}
}

public void recorrer_r(Nodo<T>aux){
if(aux!=null){
System.out.println(aux.getDato());	
recorrer_r(aux.getSiguiente());	
}
}

public void eliminarInicio(){
Nodo<T> aux=inicio;
if(aux.getSiguiente()==null){
inicio=null;	
}else{
inicio=aux.getSiguiente();	
}
}

public void eliminarUltimo(){
Nodo<T> aux=inicio;
Nodo<T> aux2=null;
if(inicio.getSiguiente()==null){
inicio=null;
}else{
while(aux.getSiguiente()!=null){
aux2=aux;
aux=aux.getSiguiente();
}
aux2.setSiguiente(null);
}
}

public void eliminarElemento(T dato){
int band=1;
Nodo<T> aux=inicio;
Nodo<T> ant=null;
while(aux.getDato()!=dato && band==1){
if(aux.getSiguiente()!=null){
ant=aux;
aux=aux.getSiguiente();
}else{
band=0;	
}
}
if(band==0){
System.out.println("el elemento con informacion " + dato + "no se encuentra en la lista");	
}else{
if (inicio ==aux){
inicio=aux.getSiguiente();	
}else{
ant.setSiguiente(aux.getSiguiente());
}	
}
}

public void eliminarAnterior(T dato){
if (inicio.getDato()==dato){
System.out.println("no hay nodo que preceda al que contiene x");	
}else{
Nodo<T> aux=inicio,ant=aux,r=null;
int band =1;
while(aux.getDato()!=dato&&band==1){
if(aux.getSiguiente()!=null){
r=ant;
ant=aux;
aux=aux.getSiguiente();
}else{
band=0;	
}	
}
if(band==0){
System.out.print("el elemento no se encuentra en la lista");
}else{
if(inicio.getSiguiente()==aux){
inicio=aux;	
}else{
r.setSiguiente(aux);	
}	
}
}	
}

public void busquedaDesor(T dato){
Nodo<T> aux=inicio;
while(aux!=null && aux.getDato()!=dato){
aux=aux.getSiguiente();	
}
if(aux==null){
System.out.println("el elemennto no se encuentra");	
}else{
System.out.println("el elemnto si esta");	
}
}

public void BusquedaOrdenada(T dato){
Nodo<T> aux=inicio;	
while(aux!=null){
aux=aux.getSiguiente();	
}
if(aux==null){
System.out.print("el elemento no se encuentra");	
}else{
System.out.println("el elemento si se encuentra");	
}
}

public void Busqueda_R(Nodo<T> e, T dato){
if(e==null){
if(e.getDato() == dato){
System.out.print("el elemento se encuentra");	
}else{
Busqueda_R(e.getSiguiente(),dato);
}	
}else{
System.out.print("no se encontro");	
}	
	
}






}

