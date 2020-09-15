package thinkinjava.chapter13_strings;//: strings/TheReplacements.java
import java.util.regex.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

//appendReplacement方法：sb是一个StringBuffer，replaceContext待替换的字符串，这个方法会把匹配到的内容替换为replaceContext，并且把从上次替换的位置到这次替换位置之间的字符串也拿到，然后，加上这次替换后的结果一起追加到StringBuffer里（假如这次替换是第一次替换，那就是只追加替换后的字符串啦）。
//
//appendTail方法：sb是一个StringBuffer，这个方法是把最后一次匹配到内容之后的字符串追加到StringBuffer中。

/*! Here's a block of text to use as input to
    the regular expression matcher. Note that we'll
    first extract the block of text by looking for
    the special delimiters, then process the
    extracted block. !*/

public class TheReplacements {
  public static void main(String[] args) throws Exception {
    String s = TextFile.read("\\zjx\\IdeaProjects\\LearnJava\\src\\thinkinjava\\chapter13_strings\\TheReplacements.java");
    // Match the specially commented block of text above:
    Matcher mInput =
      Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL)
        .matcher(s);
    if(mInput.find())
      s = mInput.group(1); // Captured by parentheses
    // Replace two or more spaces with a single space:
    s = s.replaceAll(" {2,}", " ");
    // Replace one or more spaces at the beginning of each
    // line with no spaces. Must enable MULTILINE mode:
    s = s.replaceAll("(?m)^ +", "");
    print(s);
    s = s.replaceFirst("[aeiou]", "(VOWEL1)");
    print(s);
    StringBuffer sbuf = new StringBuffer();
    Pattern p = Pattern.compile("[aeiou]");
    Matcher m = p.matcher(s);
    // Process the find information as you
    // perform the replacements:
    while(m.find()) {
            System.out.println(m.group());
      m.appendReplacement(sbuf, m.group().toUpperCase());
    }
    // Put in the remainder of the text:
    m.appendTail(sbuf);
    print(sbuf);
  }
} /* Output:
Here's a block of text to use as input to
the regular expression matcher. Note that we'll
first extract the block of text by looking for
the special delimiters, then process the
extracted block.
H(VOWEL1)rE's A blOck Of tExt tO UsE As InpUt tO
thE rEgUlAr ExprEssIOn mAtchEr. NOtE thAt wE'll
fIrst ExtrAct thE blOck Of tExt by lOOkIng fOr
thE spEcIAl dElImItErs, thEn prOcEss thE
ExtrActEd blOck.
*///:~
