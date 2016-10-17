class Missing{
def methodMissing(String name, args) {
 "$name method does not exist"
 }
 }
 Missing m = new Missing()
 assert m.test() == "test method does not exist"
