package com.dskim;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloWorldTasklet implements Tasklet {

	public RepeatStatus execute(final StepContribution contribution, final ChunkContext chunkContext) throws Exception {
		System.out.println("작업 시작...");
		// 원하는 작업을 여기에서 할수 있다.
		System.out.println("작업 완료!");
		return null;
	}
}
