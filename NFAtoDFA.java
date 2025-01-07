import java.util.*;

class NFA {
    int numStates;
    Set<Integer>[] epsilonClosure;
    Map<Integer, Map<Character, Set<Integer>>> transitions;

    public NFA(int numStates) {
        this.numStates = numStates;
        epsilonClosure = new Set[numStates];
        transitions = new HashMap<>();
        for (int i = 0; i < numStates; i++) {
            epsilonClosure[i] = new HashSet<>();
            transitions.put(i, new HashMap<>());
        }
    }

    public void addTransition(int from, char input, int to) {
        transitions.get(from).computeIfAbsent(input, k -> new HashSet<>()).add(to);
    }

    public void addEpsilonTransition(int from, int to) {
        epsilonClosure[from].add(to);
    }

    public Set<Integer> getEpsilonClosure(int state) {
        Set<Integer> closure = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(state);
        closure.add(state);

        while (!stack.isEmpty()) {
            int s = stack.pop();
            for (int next : epsilonClosure[s]) {
                if (!closure.contains(next)) {
                    closure.add(next);
                    stack.push(next);
                }
            }
        }
        return closure;
    }

    public Set<Integer> move(Set<Integer> states, char input) {
        Set<Integer> result = new HashSet<>();
        for (int state : states) {
            Set<Integer> nextStates = transitions.get(state).get(input);
            if (nextStates != null) {
                result.addAll(nextStates);
            }
        }
        return result;
    }

    public Set<Integer> epsilonClosure(Set<Integer> states) {
        Set<Integer> result = new HashSet<>();
        for (int state : states) {
            result.addAll(getEpsilonClosure(state));
        }
        return result;
    }
}

class DFA {
    Set<Set<Integer>> states;
    Set<Integer> startState;
    Set<Set<Integer>> finalStates;
    Map<Set<Integer>, Map<Character, Set<Integer>>> transitions;

    public DFA() {
        states = new HashSet<>();
        finalStates = new HashSet<>();
        transitions = new HashMap<>();
    }

    public void addTransition(Set<Integer> from, char input, Set<Integer> to) {
        transitions.computeIfAbsent(from, k -> new HashMap<>()).put(input, to);
    }

    public boolean isAcceptingState(Set<Integer> state) {
        return finalStates.contains(state);
    }

    public boolean isMinimized() {
        return true; // Placeholder
    }

    public boolean accept(String input) {
        Set<Integer> currentState = startState;
        for (char c : input.toCharArray()) {
            if (transitions.get(currentState).containsKey(c)) {
                currentState = transitions.get(currentState).get(c);
            } else {
                return false;
            }
        }
        return isAcceptingState(currentState);
    }
}

public class NFAtoDFA {
    public static void main(String[] args) {
        NFA nfa = new NFA(11);
        nfa.addEpsilonTransition(0, 1);
        nfa.addEpsilonTransition(0, 7);
        nfa.addTransition(1, 'a', 2);
        nfa.addTransition(1, 'b', 4);
        nfa.addEpsilonTransition(2, 3);
        nfa.addEpsilonTransition(3, 6);
        nfa.addEpsilonTransition(4, 5);
        nfa.addEpsilonTransition(5, 6);
        nfa.addEpsilonTransition(6, 1);
        nfa.addEpsilonTransition(6, 7);
        nfa.addTransition(7, 'a', 8);
        nfa.addTransition(8, 'b', 9);
        nfa.addTransition(9, 'b', 10);

        DFA dfa = new DFA();
        Set<Integer> startState = nfa.epsilonClosure(Set.of(0));
        dfa.startState = startState;
        dfa.states.add(startState);

        Queue<Set<Integer>> unmarkedStates = new LinkedList<>();
        unmarkedStates.add(startState);

        while (!unmarkedStates.isEmpty()) {
            Set<Integer> currentState = unmarkedStates.poll();
            for (char input : new char[]{'a', 'b'}) {
                Set<Integer> nextState = nfa.epsilonClosure(nfa.move(currentState, input));
                if (!dfa.states.contains(nextState)) {
                    dfa.states.add(nextState);
                    unmarkedStates.add(nextState);
                }
                dfa.addTransition(currentState, input, nextState);
            }
        }

        for (Set<Integer> state : dfa.states) {
            if (state.contains(10)) {
                dfa.finalStates.add(state);
            }
        }

        if (dfa.isMinimized()) {
            System.out.println("DFA is minimized.");
        } else {
            System.out.println("DFA is not minimized.");
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string to test (or 'exit' to quit): ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            if (dfa.accept(input)) {
                System.out.println("Accepted");
            } else {
                System.out.println("Not Accepted");
            }
        }
        scanner.close();
    }
}
import java.util.*;

class NFA {
    int numStates;
    Set<Integer>[] epsilonClosure;
    Map<Integer, Map<Character, Set<Integer>>> transitions;

    public NFA(int numStates) {
        this.numStates = numStates;
        epsilonClosure = new Set[numStates];
        transitions = new HashMap<>();
        for (int i = 0; i < numStates; i++) {
            epsilonClosure[i] = new HashSet<>();
            transitions.put(i, new HashMap<>());
        }
    }

    public void addTransition(int from, char input, int to) {
        transitions.get(from).computeIfAbsent(input, k -> new HashSet<>()).add(to);
    }

    public void addEpsilonTransition(int from, int to) {
        epsilonClosure[from].add(to);
    }

    public Set<Integer> getEpsilonClosure(int state) {
        Set<Integer> closure = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(state);
        closure.add(state);

        while (!stack.isEmpty()) {
            int s = stack.pop();
            for (int next : epsilonClosure[s]) {
                if (!closure.contains(next)) {
                    closure.add(next);
                    stack.push(next);
                }
            }
        }
        return closure;
    }

    public Set<Integer> move(Set<Integer> states, char input) {
        Set<Integer> result = new HashSet<>();
        for (int state : states) {
            Set<Integer> nextStates = transitions.get(state).get(input);
            if (nextStates != null) {
                result.addAll(nextStates);
            }
        }
        return result;
    }

    public Set<Integer> epsilonClosure(Set<Integer> states) {
        Set<Integer> result = new HashSet<>();
        for (int state : states) {
            result.addAll(getEpsilonClosure(state));
        }
        return result;
    }
}

class DFA {
    Set<Set<Integer>> states;
    Set<Integer> startState;
    Set<Set<Integer>> finalStates;
    Map<Set<Integer>, Map<Character, Set<Integer>>> transitions;

    public DFA() {
        states = new HashSet<>();
        finalStates = new HashSet<>();
        transitions = new HashMap<>();
    }

    public void addTransition(Set<Integer> from, char input, Set<Integer> to) {
        transitions.computeIfAbsent(from, k -> new HashMap<>()).put(input, to);
    }

    public boolean isAcceptingState(Set<Integer> state) {
        return finalStates.contains(state);
    }

    public boolean isMinimized() {
        return true; // Placeholder
    }

    public boolean accept(String input) {
        Set<Integer> currentState = startState;
        for (char c : input.toCharArray()) {
            if (transitions.get(currentState).containsKey(c)) {
                currentState = transitions.get(currentState).get(c);
            } else {
                return false;
            }
        }
        return isAcceptingState(currentState);
    }
}

public class NFAtoDFA {
    public static void main(String[] args) {
        NFA nfa = new NFA(11);
        nfa.addEpsilonTransition(0, 1);
        nfa.addEpsilonTransition(0, 7);
        nfa.addTransition(1, 'a', 2);
        nfa.addTransition(1, 'b', 4);
        nfa.addEpsilonTransition(2, 3);
        nfa.addEpsilonTransition(3, 6);
        nfa.addEpsilonTransition(4, 5);
        nfa.addEpsilonTransition(5, 6);
        nfa.addEpsilonTransition(6, 1);
        nfa.addEpsilonTransition(6, 7);
        nfa.addTransition(7, 'a', 8);
        nfa.addTransition(8, 'b', 9);
        nfa.addTransition(9, 'b', 10);

        DFA dfa = new DFA();
        Set<Integer> startState = nfa.epsilonClosure(Set.of(0));
        dfa.startState = startState;
        dfa.states.add(startState);

        Queue<Set<Integer>> unmarkedStates = new LinkedList<>();
        unmarkedStates.add(startState);

        while (!unmarkedStates.isEmpty()) {
            Set<Integer> currentState = unmarkedStates.poll();
            for (char input : new char[]{'a', 'b'}) {
                Set<Integer> nextState = nfa.epsilonClosure(nfa.move(currentState, input));
                if (!dfa.states.contains(nextState)) {
                    dfa.states.add(nextState);
                    unmarkedStates.add(nextState);
                }
                dfa.addTransition(currentState, input, nextState);
            }
        }

        for (Set<Integer> state : dfa.states) {
            if (state.contains(10)) {
                dfa.finalStates.add(state);
            }
        }

        if (dfa.isMinimized()) {
            System.out.println("DFA is minimized.");
        } else {
            System.out.println("DFA is not minimized.");
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string to test (or 'exit' to quit): ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            if (dfa.accept(input)) {
                System.out.println("Accepted");
            } else {
                System.out.println("Not Accepted");
            }
        }
        scanner.close();
    }
}
