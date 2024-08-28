package AccessTest;

import Access.TopClass; // because TopClass is public, we can import it in another package
/* import Access.TopClass2; */ // error (not accessible because TopClass2 is default (package-private))

public class TopClassTest {
}