class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split(\/\);

        for (String component : components) {
            if (component.equals(\..\)) {
                if (!stack.isEmpty()) {
                    stack.pop(); // Move up one directory
                }
            } else if (!component.equals(\\) && !component.equals(\.\)) {
                stack.push(component); // Valid directory name
            }
        }

        // Construct the simplified path
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append(\/\).append(dir);
        }

        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : \/\; 
    }
}