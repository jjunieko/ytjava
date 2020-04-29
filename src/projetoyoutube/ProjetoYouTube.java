package projetoyoutube;
public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v [] = new Video [3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu" , 22, "M");
        g[1] = new Gafanhoto("Creuza" , 23, "F");
        
        Visualizacao vis[] = new Visualizacao [5];
        vis[0] =  new Visualizacao(g[0], v[2]); // jubileu assiste HTML5
        vis[0].avaliar(35.5f);
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]); // Jubileu assiste PHP
        vis[0].avaliar(85.0f);
        System.out.println(vis[1].toString());
        
        vis[2] = new Visualizacao(g[0], v[2]); // Jubileu assiste PHP
        vis[0].avaliar(39.5f);
        System.out.println(vis[2].toString());
        
        
        
        System.out.println("\n VIDEOS -----------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("\n NEWS ALUNOS ------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println(g[2].toString());
        
    }

}
