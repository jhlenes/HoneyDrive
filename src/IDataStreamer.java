public interface IDataStreamer
{
    void addStreamListener(IStreamListener streamListener);

    void startStreaming();
}
