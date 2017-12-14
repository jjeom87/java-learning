package net.sunj.learning.tutorials.enums;

public class EnumMEthodOverride2 {
	enum State {
		FIRST_STATE {
			@Override
			void start(EnumMEthodOverride2 fsm) {
				fsm.doStart();
			}

			@Override
			void stop(EnumMEthodOverride2 fsm) {
				throw new IllegalStateException("Not Started!");
			}
		},
		SECOND_STATE {
			@Override
			void start(EnumMEthodOverride2 fsm) {
				throw new IllegalStateException("Already Started!");
			}

			@Override
			void stop(EnumMEthodOverride2 fsm) {
				fsm.doStop();
			}
		};

		abstract void start(EnumMEthodOverride2 fsm);

		abstract void stop(EnumMEthodOverride2 fsm);
	}

	private volatile State state = State.FIRST_STATE;

	public synchronized void start() {
		state.start(this);
	}

	private void doStart() {
		state = State.SECOND_STATE;
	}

	public synchronized void stop() {
		state.stop(this);
	}

	private void doStop() {
		state = State.FIRST_STATE;
	}
}
