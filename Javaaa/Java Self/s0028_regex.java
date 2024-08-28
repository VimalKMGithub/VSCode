class regex {
    public static void main(String[] args) {
        String input = "A";
        String regex = "^(?=.*[a-zA-Z]).{1,}$";
        System.out.println(input.matches(regex));
    }
}
