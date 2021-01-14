import ParameterResolver.AnagramStrings.SameLengthStrings;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test_AnagramStrings {

    @Test
    public void differentLengthTrue() {
        String s1 = "abcdefg";
        String s2 = "ac";

        int answer = AnagramStrings.areAnagram(s1, s2);
        assertEquals(answer, 0);

    }

    @Test
    public void sameLengthTrue() {
        String s1 = "tcwazyupzgafddsvcqvlnfpazfrxgfknrjkbubkxnhkncbcxqklxrtedyyrzljotqxlxxsblowpfhuzdvjwjdmroymppjwpsebuomseelkhserijrkyrdbanfsbuawikqxpzfiqscyeedhvnoabmelqcdyrqdiivvmuwzdwsrtrbwlphxgmeatclnvvdhmjhhzrcunaswwcexmpgjjwarzkxhurqcdmbyxypslixfsqkbpxhzvllcdzeborjqjbznfrnelhnnuohdzyslraynpuxgsspihfqwmkkwgctjqksvgkixlmksjxujbp";
        String s2 = "gekzxndjarezpolvblhmhdbptsciksyfnkkluvomwfavpowkuvxdjbsiewwezhqawnucfgwvfmfnbpgupujpielcicqeuywqvqqjvxxmhhbhbqingbyxpdqnfgibfdkosezirmhhporcofxzrajomvilsccfvobbbjjevzftxelvncmlofhiitrn.................";
        int answer = AnagramStrings.areAnagram(s1, s2);
        assertEquals(answer, 0);

    }

}
