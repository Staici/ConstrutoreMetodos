public class Livro{
  int ISBN;
  String Titulo="";
  String Autor="";
  String Editora="";
  int anoPublicacao;

  Livro(int ISBN, int anoPublicacao,String Titulo,String Autor,String Editora){//na instaciação do objeto terá que ser na mesma ordem
    this.ISBN=ISBN;
    this.anoPublicacao=anoPublicacao;
    this.Titulo=Titulo;
    this.Autor=Autor;
    this.Editora=Editora;
  }
  
}