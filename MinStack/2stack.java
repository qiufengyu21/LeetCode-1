Feel free to share my solution using an auxiliary stack to store the minimum element(s).

class MinStack {
        Stack<Integer> mainStack = new Stack<Integer>();
        Stack<Integer> minStack = new Stack<Integer>();

        public void push(int x) {
            mainStack.push(x);
            if (minStack.empty()) {
                minStack.push(x);
            } else if (minStack.peek() >= x) {
                minStack.push(x);
            }
        }

        public void pop() {
            int poppedElement = mainStack.pop();
            if (poppedElement == minStack.peek()) {
                minStack.pop();
            }
        }

        public int top() {
            return mainStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
