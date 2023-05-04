public class DNA {
    public static void main(String[] args) {
        String dna = "ATTAATATGTACTGA";
        System.out.println("DNA length: " + dna.length());
        int start = dna.indexOf("ATG");
        int stop = dna.indexOf("TGA", start + 3);
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein sequence: " + protein);
        } else {
            System.out.println("No protein");
        }
    }
}
