public class personagem {
    public class personagem {
        String nome;
        int energia;

        personagem(String nome, int energia) {
            this.nome = nome;
            this.energia = energia;
        }

        public void alterarenergia(int alterarenergia) {
            this.energia += alterarenergia;
            System.out.println("[energia de" + this.nome + ":" + this.energia + "]\n");
        }
    }
}
